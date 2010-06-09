package org.sonatype.tycho.test.util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.mortbay.jetty.Request;

public abstract class AbstractMonitorServlet
    extends GenericServlet
{

    private static final long serialVersionUID = -7271350776954812609L;

    private final List<String> accessedUrls;

    public AbstractMonitorServlet()
    {
        this.accessedUrls = new ArrayList<String>();
    }

    public List<String> getAccessedUrls()
    {
        return this.accessedUrls;
    }

    @Override
    public final void service( ServletRequest request, ServletResponse response )
        throws ServletException, IOException
    {
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse res = (HttpServletResponse) response;

        String uri = ( (Request) req ).getUri().toString();
        if ( !uri.endsWith( ".sha1" ) && !uri.endsWith( ".md5" ) )
        {
            accessedUrls.add( uri );
        }

        service( req, res );
    }

    protected void addUri( HttpServletRequest req )
    {
        String uri = ( (Request) req ).getUri().toString();
        if ( !accessedUrls.contains( uri ) )
        {
            accessedUrls.add( uri );
        }
    }

    public abstract void service( HttpServletRequest req, HttpServletResponse res )
        throws ServletException, IOException;
}
