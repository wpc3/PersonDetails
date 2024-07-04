package com.zipcodewilmington;

/**
 * Created by leon on 1/24/18.
 */
public class PersonHandler {
    private final Person[] personArray;

    public PersonHandler(Person[] personArray) {
        this.personArray = personArray;
    }

    // NOTICE how the comments can be used to step-by-step break down the problem into 
    // simple lines of code...
    
    public String whileLoop() {
        String result = "";
        // create a `counter`
        int counter = 0;

        // while `counter` is less than length of array
            // begin loop
    while (counter < personArray.length){
    result = result + personArray[counter].toString();
     counter++;

    }
                // use `counter` to identify the `current Person` in the array


                // get `string Representation` of `currentPerson`


                // append `stringRepresentation` to `result` variable



            // end loop
        return result;
    }



    public String forLoop() {
        String result = "";
        // identify initial value
        // identify terminal condition

        for (int i= 0; i < personArray.length; i++ ){
            result = result + personArray[i].toString();


        }

        // identify increment

        // use the above clauses to declare for-loop signature
            // begin loop
                // use `counter` to identify the `current Person` in the array
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
            // end loop

        return result;
    }



    public String forEachLoop() {
        String result = "";

    for(Person person : personArray){

        result += person.toString();
        }
        // identify array's type
        // identify array's variable-name

        // use the above discoveries to declare for-each-loop signature
            // begin loop
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
            // end loop

        return result;
    }


    public Person[] getPersonArray() {
        return personArray;
    }
}
