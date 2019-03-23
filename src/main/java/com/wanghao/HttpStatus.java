package com.wanghao;

/**
 * Created by wanghao on 3/22/19.
 */

public enum HttpStatus {

    CONTINUE(100,"Continue"),
    SWITCHING_PROTOCOLS(101,"Switching Protocols"),
    PROCESSING(102,"Processing"),
    OK(200,"OK"),
    CREATED(201,"Created"),
    ACCEPTED(202,"Accepted"),
    NON_AUTHORIRATIVE_INFORMATION(203,"Non-Authoritative Information"),
    NO_CENTENT(204,"No Content"),
    RESET_CONTENT(205,"Reset Content"),
    PARTIAL_CONTENT(206,"Partial Content"),
    MULTIPLE_CHOICES(300,"Multiple Choices"),
    MOVED_PERMANENTLY(301,"Moved Permanently"),
    FOUND(302,"Found"),
    SEE_OTHER(303,"See Other"),
    NOT_MODIFIED(304,"Not Modified"),
    USE_PROXY(305,"Use Proxy"),
    UNUSED(306,"Unused"),
    TEMPORARY_REDIRECT(307,"Temporary Redirect"),
    PERMANENT_REDIRECT(308,"Permanent Redirect"),
    BAD_REQUEST(400,"Bad Request"),
    UNAUTHORIZED(401,"Unauthorized"),
    PAYMENT_REQUIRED(402,"Payment Required"),
    FORBIDDEN(403,"Forbidden"),
    NOT_FOUND(404,"Not Found"),
    METHOD_NOT_ALLOWED(405,"Method Not Allowed"),
    NOT_ACCEPTABLE(406,"Not Acceptable"),
    PROXY_AUTHENTICATION_REQUIRED(407,"Proxy Authentication Required"),
    REQUEST_TIMEOUT(408,"Request Timeout"),
    CONFLICT(409,"Conflict"),
    GONE(410,"Gone"),
    LENGTH_REQUIRED(411,"Length Required"),
    PRECONDITION_FAILED(412,"Precondition Failed"),
    REQUEST_ENTITY_TOO_LARGE(413,"Request Entity Too Large"),
    REQUEST_URI_TOO_LONG(414,"Request-URI Too Long"),
    UNSUPPORTED_MEDIA_TYPE(415,"Unsupported Media Type"),
    REQUEST_RANGE_NOT_SATISFIABLE(416,"Requested Range Not Satisfiable"),
    EXPECTATION_FAILED(417,"Expectation Failed"),
    IM_A_TEAPOT(418,"I'm a teapot"),
    MISDIRECTED_REQUEST(421,"Misdirected Request"),
    UNPROCESSABLE_ENTITY(422,"Unprocessable Entity"),
    PRECONDITION_REQUIRED(428,"Precondition Required"),
    TOO_MANY_REQUESTS(429,"Too Many Requests"),
    REQUEST_HEADER_FIELDS_TOO_LARGE(431,"Request Header Fields Too Large"),
    UNAVAILABLE_FOR_LEGAL_REASONS(451,"Unavailable For Legal Reasons"),
    INTERNAL_SERVER_ERROR(500,"Internal Server Error"),
    NOT_IMPLEMENTED(501,"Not Implemented"),
    BAD_GATEWAY(502,"Bad Gateway"),
    SERVICE_UNAVAILABLE(503,"Service Unavailable"),
    GATEWAY_TIMEOUT(504,"Gateway Timeout"),
    HTTP_VERSION_NOT_SUPPORTED(505,"HTTP Version Not Supported"),
    NETWORK_AUTHENTICATION_REQUIRED(511,"Network Authentication Required"),
    WEB_SERVER_IS_RETURNING_AN_UNKNOWN_ERROR(520,"Web server is returning an unknown error"),
    CONNECTION_TIMED_OUT(522,"Connection timed out"),
    A_TIMEOUT_OCCURRED(524,"A timeout occurred");

    private final int code;

    private final String reason;

    HttpStatus(int code, String reason) {
        this.code = code;
        this.reason = reason;
    }

    public int getCode() {
        return code;
    }

    public String getReason() {
        return reason;
    }

    public static HttpStatus fromCode(int code){
        for (HttpStatus status : HttpStatus.values()){
            if (status.code == code){
                return status;
            }
        }
        return null;
    }

}
