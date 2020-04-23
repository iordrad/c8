import serviceC.HelloService;

module E {
    requires C;

    //modulul E cauta implementari ale interfetei HelloService
    uses HelloService;
}