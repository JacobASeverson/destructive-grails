package io.jacobaseverson.destructive

import org.springframework.beans.factory.annotation.Autowired

class DestructiveController {

    private final InstanceNameHolder instanceNameHolder

    @Autowired
    DestructiveController(InstanceNameHolder instanceNameHolder) {
        this.instanceNameHolder = instanceNameHolder
    }

    def index() {
        render view: 'index', model: [instanceName: instanceNameHolder.name]
    }

    def destroy() {
        System.exit(0)
    }

}
