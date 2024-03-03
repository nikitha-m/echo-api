const express = require('express');
const axios = require('axios');
const bodyParser = require('body-parser');

const app = express();
app.use(bodyParser.json());

const SPRING_BOOT_URL = 'http://localhost:8081'; // Change this according to your Spring Boot server URL

// Endpoint to send data to Spring Boot
app.post('/dataReceive', async (req, res) => {
  try {
    const dataToSend = {
        key1: 'value1',
        key2: 'value2',
    };
    // Send data to Spring Boot
    const response = await axios.post(`${SPRING_BOOT_URL}/dataReceive`, dataToSend);
    res.json(response.data);
  } catch (error) {
    console.error('Error sending data to Spring Boot:', error);
    res.status(500).json({ error: 'Internal server error' });
  }
});

// Start the Express server
const PORT = process.env.PORT || 3000;
app.listen(PORT, () => {
  console.log(`Server is running on port ${PORT}`);
});
