package coroutines

import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

/*
* async: return deferred value yang berupa hasil atau exception.
* Deferred: sama seperti job namun deferred memiliki tipe hasil return value yang berbeda.
* Hasil deferred yang mencapai state completed dapat diakses fungsi await.
* Sementara Deferred akan mengirimkan pengecualian jika ia telah gagal dengan fungsi getCompletionExceptionOrNull.
*
* */

fun main() = runBlocking {
    val capital = async { getCapital() }
    val income = async { getIncome() }
    println("Your profit is ${income.await() - capital.await()}")
}