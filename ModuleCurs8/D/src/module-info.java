import serviceC.HelloService;
import serviceD.EnglishHelloService;

module D {
    requires C;

    //expunem o implementare a interfetei HelloService
    provides HelloService with EnglishHelloService;
    //modulul D ofera implementare pentru C
}