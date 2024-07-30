class Bank{
    #balance = 1000
    constructor (owner){
        this.owner = owner
    }
    deposite(amount){
        this.#balance += amount
    }
    withdraw(amount){
        this.#balance -= amount
    }
    getBalance(){
        return this.#balance
    }
}
const acc=new Bank("Rahul");
acc.deposite(1000);
acc.withdraw(500);
console.log(acc.getBalance());
console.log(acc.owner);
// console.log(acc.#balance);

