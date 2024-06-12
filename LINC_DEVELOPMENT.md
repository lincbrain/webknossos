# LINC | WebKNOSSOS Development

This document is designed to help develop new features locally for LINC | WebKNOSSOS

### CLI Installation

WebKNOSSOS CLI tool docs say that there is support between Python>=3.8,<=3.11. 
There were some intractable failures with 3.11, so 3.10 is used here

First, create a venv within 3.10 -- pyenv is a good tool to use if you are using 3.12 locally

```shell
# Set up local environment
pyenv local 3.10
pyenv exec python3 -m venv venv
source venv/bin/activate

# Install webknossos library
pip install webknossos

# Failure might occur with finding PIL import, thus possibly:
pip install Pillow

# At this point, you should be able to use the webknossos CLI --
webknossos help
```

You'll need to set your authentication token as an env var `WK_TOKEN`: go to https://webknossos.lincbrain.org/auth/token 
(or https://webknossos-staging.lincbrain.org/auth/token if you are on staging)

### Temp Links

https://webknossos-staging.lincbrain.org/api/v5/user/annotations
