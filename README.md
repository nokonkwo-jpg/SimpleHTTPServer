# SimpleHTTPServer

This is a basic Java implementation of an HTTP server that listens on port 8080. It accepts incoming HTTP requests and prints the request details to the console. This project demonstrates basic socket programming and handling HTTP requests.

## Features

- Listens for HTTP connections on port 8080.
- Reads incoming HTTP requests from clients.
- Prints each line of the request to the console.

## Requirements

- Java Development Kit (JDK) 8 or higher

## Getting Started

### Step 1: Clone the Repository

```bash
git clone https://github.com/your-username/SimpleHTTPServer.git
cd SimpleHTTPServer
```

### Step 2: Compile the Code
To compile the SimpleHTTPServer Class, run:

```bash
javac SimpleHTTPServer.java
```
### Step 3: Run the Server
Run the server with the following command:

```bash
java SimpleHTTPServer
```

### Step4: Send a Request

Once the server is running, you can send an HTTP request using a browser or a curl command in terminal:

- Browser: Open http://localhost:8080 in your web browser.
- Curl Command:

```bash
curl http://localhost:8080
```

