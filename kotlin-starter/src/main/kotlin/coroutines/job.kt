package coroutines

import kotlinx.coroutines.*

/*
* JOB: perintah async yang dijalankan.
* start(): memulai job tanpa harus menunggu job tersebut selesai
* join(): menunda eksekusi sampai job selesai
* cancel(): menbatalkan job yang sedang active
* */

@InternalCoroutinesApi
fun main() = runBlocking {
    val job = launch(start =  CoroutineStart.LAZY){
        delay(1000L)
        println("Start new job!")
    }

    delay(2000)
    job.cancel(cause = CancellationException("time is up!"))
    println("Canceling job")
    if (job.isCancelled){
        println("Job is cancelled because ${job.getCancellationException().message}")
    }
//    job.join()
//    println("Other task")
}