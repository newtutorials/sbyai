@Test
public void testMyStaticMethod() {
    Mockito.mockStatic(MyClassToTest.class);
    Mockito.when(MyClassToTest.myStaticMethod()).thenReturn(expectedResult);

    // Execute your code that calls the static method

    // Verify the behavior
}
