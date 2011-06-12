# Scalatra MongoDB project

[g8](http://github.com/n8han/giter8) template to get a Scalatra web service up and running quickly with MongoDB support using Casbah. The template generates a file that uses SBT 0.10.x

## Usage

Install giter8 (g8) - [readme](http://github.com/n8han/giter8#readme) for more information.

Install SBT 0.10.x - [Setup](https://github.com/harrah/xsbt/wiki/Setup) for more information.

In a shell, run the following:

    g8 JanxSpirit/scalatra-mongodb
    cd <name-of-app>
    sbt
    > jetty-run
    
You should be able to browse to a [test resource](http://localhost:8080)

## What's inside

The servlet provides two resources:
1. 'test' - a 'Hello World' type resource just to make sure everything is working.
2. 'msgs' - GET msgs to see all records currently in the database and a form to add another record - the form issues a POST to the same resource to add records

The project includes a few basic tests to get you started. Run 'sbt test' to see the test output.

The template allows you to configure where your MongoDB server is running, the name of your servlet and other parameters.

## Thanks

Thanks to [Nathan Hamblen](https://github.com/n8han) for [giter8](https://github.com/n8han/giter8), [Brendan McAdams](https://github.com/bwmcadams) for the [Casbah](https://github.com/mongodb/casbah) MongoDB Driver and [Ross Baker](https://github.com/rossabaker) for [Scalatra[(https://github.com/scalatra/scalatra).
