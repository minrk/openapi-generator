/**
* OpenAPI Petstore
* This is a sample server Petstore server. For this sample, you can use the api key `special-key` to test the authorization filters.
*
* The version of the OpenAPI document: 1.0.0
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package org.openapitools.server.apis

import com.google.gson.Gson
import io.ktor.application.call
import io.ktor.auth.UserIdPrincipal
import io.ktor.auth.authentication
import io.ktor.auth.authenticate
import io.ktor.auth.OAuthAccessTokenResponse
import io.ktor.auth.OAuthServerSettings
import io.ktor.http.ContentType
import io.ktor.http.HttpStatusCode
import io.ktor.locations.KtorExperimentalLocationsAPI
import io.ktor.locations.delete
import io.ktor.locations.get
import io.ktor.response.respond
import io.ktor.response.respondText
import io.ktor.routing.Route
import io.ktor.routing.post
import io.ktor.routing.put
import io.ktor.routing.route

import org.openapitools.server.Paths
import org.openapitools.server.infrastructure.ApiPrincipal


import org.openapitools.server.models.User

@KtorExperimentalLocationsAPI
fun Route.UserApi() {
    val gson = Gson()
    val empty = mutableMapOf<String, Any?>()

    route("/user") {
        post {
            call.respond(HttpStatusCode.NotImplemented)
        }
    }


    route("/user/createWithArray") {
        post {
            call.respond(HttpStatusCode.NotImplemented)
        }
    }


    route("/user/createWithList") {
        post {
            call.respond(HttpStatusCode.NotImplemented)
        }
    }


    delete<Paths.deleteUser> {  _: Paths.deleteUser ->
        call.respond(HttpStatusCode.NotImplemented)
    }


    get<Paths.getUserByName> {  _: Paths.getUserByName ->
        val exampleContentType = "application/json"
        val exampleContentString = """{
          "firstName" : "firstName",
          "lastName" : "lastName",
          "password" : "password",
          "userStatus" : 6,
          "phone" : "phone",
          "id" : 0,
          "email" : "email",
          "username" : "username"
        }"""
        
        when(exampleContentType) {
            "application/json" -> call.respond(gson.fromJson(exampleContentString, empty::class.java))
            "application/xml" -> call.respondText(exampleContentString, ContentType.Text.Xml)
            else -> call.respondText(exampleContentString)
        }
    }


    get<Paths.loginUser> {  _: Paths.loginUser ->
        call.respond(HttpStatusCode.NotImplemented)
    }


    get<Paths.logoutUser> {  _: Paths.logoutUser ->
        call.respond(HttpStatusCode.NotImplemented)
    }


    route("/user/{username}") {
        put {
            call.respond(HttpStatusCode.NotImplemented)
        }
    }

}