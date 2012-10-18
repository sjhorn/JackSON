package jackson

import com.hornmicro.JackSON

class HelloController {

    def index() { 
        render( params as JackSON )
    }
}
