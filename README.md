# What is the proposed name for your Web application?

Traveler Blogs

# Who is the target audience for your Web application?

Web application target audience are travelers all around the United States who like traveling and sharing their experiences.

# What problem is it intended to solve for the target audience?

Hundreds and even thousands of travelers travel around the world every day. But just few of them share their experience on web sites, and different people choose different platforms to post their photos or instructions for followers. Besides, there are such few web sites concentrating on location-based traveler blog which I intend to create it just for sharing photos, stories, instructions, recommendations and suggestions by travelers. I want to solve problems by searching all the information users need through the 'Traveler Blogs' sorted by location correlation.

# How will it meet the minimum project requirements?

My site will use the freemium model. Most of the content will be freely accessible without a login. If users want to interact with each other, a login will be required which I'll store in my database. I'll also support OAuth2 authentication if the users do not want to create an username and password on my site. Once the user is signed up for the site, every source is free for every user. But users can choose whether donate or not and I'll use Venmo for payments. All public data will be accessible through RESTful services. All RESTful services will data in both JSON and XML formats.

# Why is your proposed Web application unique or creative beyond simply meeting the minimum requirements?

My site will customize the experience to the users locations. I'll track site usage, interactions with others, and content viewed to provide a customized experience. And when I gather enough information, I'll create official best travel route and its best travel time for different kinds of travelers including different themes like culture and history, or best route to take photos. I'll engage active users with advice on how to advance their training. I'll engage inactive users by sending motivational messages encouraging them to join the community.



## Build status

TODO : Modify to match your project specific Travis Build
[![Build Status](https://travis-ci.org/infsci2560sp17/full-stack-web-HaoY16.svg?branch=master)](https://travis-ci.org/infsci2560sp17/full-stack-web-HaoY16)

## Web Site

https://radiant-mesa-88066.herokuapp.com/

## Key Features

TODO : Please list key features of your project.

* File Upload
* Blog Search 

## Project Details

### Landing Page

TODO : please provide a description of your landing page inluding a screen shot ![](https://.../image.JPG)

### User Input Form

TODO : please provide a description of at least 1 user input form including a screen shot ![](https://.../image.jpg)

## API

TODO : please provide a description of at least 1 API including a sample of request data and response data in both XML and JSON format.

### API Method 1

    POST photos/:id/tags

#### Parameters

- **id** _(required)_ — The Photo ID to add tags for.
- **tags** _(required)_ — Comma separated tags.

#### Response

A JSON or XMLobject containing the PhotoID and list of tags accepted.

#### Errors

All known errors cause the resource to return HTTP error code header together with a JSON array containing at least 'status' and 'error' keys describing the source of error.

- **404 Not Found** — The photo was not found.

#### Example

##### Request

    POST /v1/photos/123456/tags

##### Body

    tags=cute,puppy


##### JSON Response

```json
{
    "photoId": 123456,
    "tags": ["cute", "puppy"]
}
```

##### XML Response

```xml
<?xml version="1.0" encoding="UTF-8"?>
<PhotoTags>
    <photoId>123456</PhotoId>
        <tags>
            <tag>cute</tag>
            <tag>puppy</tag>
        </tags>
</PhotoTags>
```

## Technologies Used

TODO : List all technologies used in your project

- [Spring Boot](https://projects.spring.io/spring-boot/) - Takes an opinionated view of building production-ready Spring applications.
- [Thymleaf](http://www.thymeleaf.org/) - Thymeleaf is a modern server-side Java template engine for both web and standalone environments.
- [Maven](https://maven.apache.org/) - Apache Maven is a software project management and comprehension tool.
