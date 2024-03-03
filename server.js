const express = require('express');
const bodyParser = require('body-parser');
const app = express();
const port = 3000;

// Middleware to parse JSON bodies
app.use(bodyParser.json());

// Define the data you want to send
const dataToSend = {
  key1: 'value1',
  key2: 'value2',
  key3: 'value3'
};

// Route to send data
app.post('/send-data', (req, res) => {
  // Assuming your Spring Boot server is running on localhost:8080
  const url = 'http://localhost:8081/send-data';

  // Send the data to Spring Boot server
  fetch(url, {
    method: 'POST',
    body: JSON.stringify(dataToSend),
    headers: { 'Content-Type': 'application/json' },
  })
  .then(response => {
    if (response.ok) {
      console.log('Data sent successfully');
      res.send('Data sent successfully');
    } else {
      console.error('Failed to send data');
      res.status(500).send('Failed to send data');
    }
  })
  .catch(error => {
    console.error('Error sending data:', error);
    res.status(500).send('Error sending data');
  });
});

app.listen(port, () => {
  console.log(`Node.js server listening at http://localhost:${port}`);
});
