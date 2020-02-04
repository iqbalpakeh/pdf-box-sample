#!/bin/sh

mvn -B archetype:generate \
  -DarchetypeGroupId=org.apache.maven.archetypes \
  -DgroupId=com.mpakeh \
  -DartifactId=pdf-extractor-app
