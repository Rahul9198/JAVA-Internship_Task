class Animal{
    makesound(){
        console.log("making sound");
    }
}

class Dog extends Animal{
    makesound(){
        console.log("barking");
    }
}

let obj = new Dog();
obj.makesound();
