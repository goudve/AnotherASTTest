/**
 * Created by vgoud on 11/14/14.
 */
class YATest {
    @WithLogging
    static def greeting(){
        println "greeting is called"
    }

    static void main(String[] args){
        YATest.greeting()
    }
}
