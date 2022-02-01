package com.c0de_h0ng.presentation;

import dagger.hilt.InstallIn;
import dagger.hilt.codegen.OriginatingElement;
import dagger.hilt.components.SingletonComponent;
import dagger.hilt.internal.GeneratedEntryPoint;

@OriginatingElement(
    topLevelClass = GitHubApplication.class
)
@GeneratedEntryPoint
@InstallIn(SingletonComponent.class)
public interface GitHubApplication_GeneratedInjector {
  void injectGitHubApplication(GitHubApplication gitHubApplication);
}
