#!/bin/bash

keytool -genkey -alias sslserver -keyalg RSA -keysize 2048 -validity 700 -keypass changeit -storepass changeit -keystore src/main/resources/ssl-server.jks
