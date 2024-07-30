class task{
    constructor (title){
        this.title = title;
        this.completed = false;

    }

    complete(){
        this.completed = true;
    }
    show(){
        console.log(`${this.title} - ${this.completed}`);
}

}
class TaskList{
    constructor(){
        this.tasks = [];
    }
    add(task){
        this.tasks.push(task);
    }
    showAll(){
        for(let task of this.tasks){
            task.show();
        }
    }
    completeAll(){
        for(let task of this.tasks){
            task.complete();
        }
    }
}

let task1 = new task("task1");
let task2 = new task("task2");
task1.add(new TaskList('learn JS'));
task1.showAll();
task1.completeAll();
task1.showAll();

