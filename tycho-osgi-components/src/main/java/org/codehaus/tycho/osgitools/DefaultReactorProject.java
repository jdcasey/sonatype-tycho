package org.codehaus.tycho.osgitools;

import java.io.File;
import java.util.List;
import java.util.Set;

import org.apache.maven.execution.MavenSession;
import org.apache.maven.project.MavenProject;
import org.sonatype.tycho.ReactorProject;

public class DefaultReactorProject
    implements ReactorProject
{

    public DefaultReactorProject( MavenProject project )
    {

    }

    public static ReactorProject adapt( MavenProject project )
    {
        // TODO Auto-generated method stub
        return null;
    }

    public static List<ReactorProject> adapt( MavenSession session )
    {
        // TODO Auto-generated method stub
        return null;
    }

    public static boolean sameProject( ReactorProject otherProject, MavenProject project )
    {
        // TODO Auto-generated method stub
        return false;
    }
    
    
    public File getBasedir()
    {
        // TODO Auto-generated method stub
        return null;
    }

    public String getPackaging()
    {
        // TODO Auto-generated method stub
        return null;
    }

    public String getGroupId()
    {
        // TODO Auto-generated method stub
        return null;
    }

    public String getArtifactId()
    {
        // TODO Auto-generated method stub
        return null;
    }

    public String getVersion()
    {
        // TODO Auto-generated method stub
        return null;
    }

    public File getOutputDirectory()
    {
        // TODO Auto-generated method stub
        return null;
    }

    public File getBuildDirectory()
    {
        // TODO Auto-generated method stub
        return null;
    }

    public File getTestOutputDirectory()
    {
        // TODO Auto-generated method stub
        return null;
    }

    public File getArtifact()
    {
        // TODO Auto-generated method stub
        return null;
    }

    public File getArtifact( String artifactClassifier )
    {
        // TODO Auto-generated method stub
        return null;
    }

    public Object getContextValue( String key )
    {
        // TODO Auto-generated method stub
        return null;
    }

    public void setContextValue( String key, Object value )
    {
        // TODO Auto-generated method stub
        
    }

    public Set<String> getClassifiers()
    {
        // TODO Auto-generated method stub
        return null;
    }

    public void setDependencyMetadata( String classifier, Set<Object> installableUnits )
    {
        // TODO Auto-generated method stub
        
    }

    public Set<Object> getDependencyMetadata( String classifier )
    {
        // TODO Auto-generated method stub
        return null;
    }

    public Set<Object> getRuntimeMetadata( String classifier )
    {
        // TODO Auto-generated method stub
        return null;
    }

    public String getExpandedVersion()
    {
        // TODO Auto-generated method stub
        return null;
    }

    public void setExtendedVersion()
    {
        // TODO Auto-generated method stub
        
    }

    public String getId()
    {
        // TODO Auto-generated method stub
        return null;
    }

}
