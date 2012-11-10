package jackson

import com.hornmicro.JackSON

class HelloController {

    def index(SomeCommand command) {
        //render( (request.JSON as String) + "\n\n\n" + params + "\n\n\n"+command.name)
        
        command.validate() 
        render( command.errors as JackSON )
    }
}

class SomeCommand {
    static constraints = {
        name(nullable: false, blank: false)
    }
    String name
    
}
