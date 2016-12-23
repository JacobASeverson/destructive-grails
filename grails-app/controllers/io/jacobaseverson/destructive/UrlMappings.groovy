package io.jacobaseverson.destructive

class UrlMappings {

    static mappings = {
        "/"(controller: 'destructive')
        "/destroy"(controller: 'destructive', action: 'destroy')
        "500"(controller: 'destructive')
        "404"(controller: 'destructive')
    }
}
