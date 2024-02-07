// This file focuses on the Sealed class type //

final class Final {
    // Can not be inherited

}

abstract class Abstract {
    // Can not instantiate objs
}

sealed  class Sealed permits Y, Q {
    // only permitted class can inherit this class
}

final class Y extends Sealed{
    // must be final - sealed - or non sealed
}

final class Q extends Sealed{
    // must be final - sealed - or non sealed
}


public class Classes {
    public static void main(String[] args) {
        // We can also use sealed keyword with interfaces
    }
}
