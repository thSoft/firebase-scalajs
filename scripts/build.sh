#!/usr/bin/env bash
cd "${0%/*}/.."

sbt publishLocal
