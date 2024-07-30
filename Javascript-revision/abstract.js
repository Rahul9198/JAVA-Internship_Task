class vehicle{
    constructor(make,model){
        this.make = make;
        this.model = model;

    }
    start(){
        throw new Error("method not implemented");
    }
    getdetails(){
        return 'this vehicle is ' + this.make + ' ' + this.model;
    }
}
class car extends vehicle{
    constructor(make,model){
        super(make,model);
    }
    start(){
        return 'car is starting';
    }
}
let car1 = new car('honda','city');
console.log(car1.getdetails());
console.log(car1.start());