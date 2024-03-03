// server.js

const express = require('express');
const bodyParser = require('body-parser');

const app = express();
const port = 3000;

app.use(bodyParser.json());

app.post('/receiveData', (req, res) => {
    const receivedData = req.body;
    console.log('Data received from Spring Boot:', receivedData);
    // Here you can process the received data as needed
    res.send('Data received by Node.js server');
});

app.listen(port, () => {
    console.log(`Node.js server listening at http://localhost:${port}`);
});
