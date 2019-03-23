package com.wanghao;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

/**
 * Created by wanghao on 3/18/19.
 */
public class App {

    private static final int DEFAULT_PORT = 8080;

    public static void main(String[] args) throws Exception {
        int argsLen = args.length;
        int port;
        if (argsLen != 1){
            port = DEFAULT_PORT;
        } else {
            port = Integer.parseInt(args[argsLen-1]);
        }

        Server jetty = new Server(port);

        ServletContextHandler context = new ServletContextHandler();
        context.setContextPath("/");

        jetty.setHandler(context);

        ServletHolder jerseyServlet = context.addServlet(
                org.glassfish.jersey.servlet.ServletContainer.class, "/*");
        jerseyServlet.setInitOrder(0);

        // Tells the Jersey Servlet which REST service/class to load.
        jerseyServlet.setInitParameter(
                "jersey.config.server.provider.classnames",
                EntryPoint.class.getCanonicalName());

        jetty.start();
        System.out.println("server started on port: " + port);
        jetty.join();
    }
}
