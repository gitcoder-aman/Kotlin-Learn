package com.example.kotlinsample._17Delegations

fun main() {

    val taskName : String  = "download Task"
    val taskManager = TaskManager1(BgTask(taskName),BgExecute(taskName))
    taskManager.create()
    taskManager.execute()
}

interface Task{
    fun create()
}
interface ExecuteTask{
    fun execute()
}
//Delegation use remove redundancy code

class TaskManager1(val creator : Task, val executor : ExecuteTask)
    :Task by creator,ExecuteTask by executor {

}
class BgTask(private val taskName : String ) : Task{
    override fun create() {
        println("Task:$taskName Created")
    }
}
class BgExecute(private val taskName : String) : ExecuteTask{
    override fun execute() {
        println("Task $taskName execute")
    }

}