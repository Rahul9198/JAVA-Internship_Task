// inheroitance in javascript
class person {
    constructor(name, age) {
        this.name = name;
        this.age = age;
    }
    display() {
        console.log(this.name, this.age);
    }
}
class student extends person {
    constructor(name, age) {
        super(name, age);
    }
    display() {
        console.log(this.name, this.age);
    }
}
let obj = new student("vishal", 21);
obj.display();