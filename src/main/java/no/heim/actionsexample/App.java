
package no.heim.actionsexample;


import fi.iki.elonen.NanoHTTPD;

import java.io.IOException;

public class App extends NanoHTTPD {
    private final Greeter greeter;

    public App(Greeter greeter) throws IOException {
        super(8080);
        this.greeter = greeter;
        start(NanoHTTPD.SOCKET_READ_TIMEOUT, false);
    }

    public static void main(String[] args ) throws IOException {
        Greeter greeter = new Greeter();
        new App(greeter);
    }

    @Override
    public Response serve(IHTTPSession session) {
        return newFixedLengthResponse(greeter.getGreeting() );
    }
}