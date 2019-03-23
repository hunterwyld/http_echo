## http_echo

*http_echo* is a simple http server which echoes http status back as you want. You can use it as a handy testing tool when a specified http status is expected to return.

### Usage

#### To start the server

Download executable [here](https://github.com/hunterwyld/http_echo/releases/download/v1.0.0/http_echo-1.0.0.tar.gz) and extract tar file

`cd bin`

Run `./start.sh` to start the server on default port 8080, or `./start.sh -p {port}` on the assigned port

#### To access the server

Send request to the server using arbitrary http client, e.g. `java httpclient` or `curl`

`curl -i -X [GET|POST|PUT|DELETE|HEAD|OPTIONS] http://127.0.0.1:8080/api/{code}`

quick example: http://127.0.0.1:8080/api/200  http://127.0.0.1:8080/api/500

#### Http status supported

```
100 Continue
101 Switching Protocols
102 Processing
200 OK
201 Created
202 Accepted
203 Non-Authoritative Information
204 No Content
205 Reset Content
206 Partial Content
300 Multiple Choices
301 Moved Permanently
302 Found
303 See Other
304 Not Modified
305 Use Proxy
306 Unused
307 Temporary Redirect
308 Permanent Redirect
400 Bad Request
401 Unauthorized
402 Payment Required
403 Forbidden
404 Not Found
405 Method Not Allowed
406 Not Acceptable
407 Proxy Authentication Required
408 Request Timeout
409 Conflict
410 Gone
411 Length Required
412 Precondition Failed
413 Request Entity Too Large
414 Request-URI Too Long
415 Unsupported Media Type
416 Requested Range Not Satisfiable
417 Expectation Failed
418 I'm a teapot
421 Misdirected Request
422 Unprocessable Entity
428 Precondition Required
429 Too Many Requests
431 Request Header Fields Too Large
451 Unavailable For Legal Reasons
500 Internal Server Error
501 Not Implemented
502 Bad Gateway
503 Service Unavailable
504 Gateway Timeout
505 HTTP Version Not Supported
511 Network Authentication Required
520 Web server is returning an unknown error
522 Connection timed out
524 A timeout occurred
```

> Inspired by https://httpstat.us/
