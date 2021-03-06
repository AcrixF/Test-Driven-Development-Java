package org.neoa.ch03.tictactoe.helps;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.neoa.ch03.tictactoe.helps.Foo;

public class FooTest {

    @Rule
    public ExpectedException exception = ExpectedException.none();

    private Foo foo;

    @Before
    public void setUp() {
        foo = new Foo();
    }

    @Test
    public void whenDoFooThenThrowRuntimeException() {
        exception.expect(RuntimeException.class);
        foo.doFoo();
    }
}
