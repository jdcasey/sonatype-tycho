/*******************************************************************************
 * Copyright (c) 2008, 2011 Sonatype Inc. and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Sonatype Inc. - initial API and implementation
 *******************************************************************************/
package org.eclipse.tycho.core.osgitools;

import java.io.File;
import java.util.Set;

import org.eclipse.tycho.ArtifactDescriptor;
import org.eclipse.tycho.ArtifactKey;
import org.eclipse.tycho.ReactorProject;

public class DefaultArtifactDescriptor implements ArtifactDescriptor {

    private final ArtifactKey key;

    private final File location;

    private final ReactorProject project;

    private final String classifier;

    private final Set<Object> installableUnits;

    public DefaultArtifactDescriptor(ArtifactKey key, File location, ReactorProject project, String classifier,
            Set<Object> installableUnits) {
        this.key = key;
        this.location = location;
        this.project = project;
        this.classifier = classifier;
        this.installableUnits = installableUnits;
    }

    public ArtifactKey getKey() {
        return key;
    }

    public File getLocation() {
        return location;
    }

    public ReactorProject getMavenProject() {
        return project;
    }

    public String getClassifier() {
        return classifier;
    }

    public Set<Object> getInstallableUnits() {
        return installableUnits;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(key.toString()).append(": ");
        if (project != null) {
            sb.append(project.toString());
        } else {
            sb.append(location);
        }
        return sb.toString();
    }
}
