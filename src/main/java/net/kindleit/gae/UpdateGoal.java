/*
 * Copyright 2008 Kindleit Technologies. All rights reserved. This file, all
 * proprietary knowledge and algorithms it details are the sole property of
 * Kindleit Technologies unless otherwise specified. The software this file
 * belong with is the confidential and proprietary information of Kindleit
 * Technologies. ("Confidential Information"). You shall not disclose such
 * Confidential Information and shall use it only in accordance with the terms
 * of the license agreement you entered into with Kindleit.
 */
package net.kindleit.gae;

import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;

import com.google.appengine.tools.admin.AppCfg;

/**
 * Goal for run a WAR project on the GAE dev server.
 *
 * @author jpeynado@kindleit.net
 * @author rhansen@kindleit.net
 *
 * @goal update
 * @execute phase=package
 *
 */
public class UpdateGoal extends EngineGoalBase {

  public void execute() throws MojoExecutionException, MojoFailureException {

    getLog().info("Updating Google App Engine Server...");

    System.setProperty("appengine.sdk.root", sdkDirectory);

    final String[] args = {"--disable_prompt", "update", appDir};
    AppCfg.main(args);
  }
}


