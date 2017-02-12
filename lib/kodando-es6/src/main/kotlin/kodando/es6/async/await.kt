package kodando.es6.async

import kodando.es6.Promise
import kotlin.coroutines.experimental.suspendCoroutine

/**
 * Created by danfma on 17/01/2017.
 */

suspend fun <T> await(block: Promise<T>): T =
	suspendCoroutine { c ->
		block
			.then { data -> c.resume(data) }
			.catch { error -> c.resumeWithException(AsyncException(error)) }
	}

suspend fun <T> await(block: Future<T>): T =
	suspendCoroutine { c ->
		block
			.continueWith { data -> c.resume(data) }
			.catch { error -> c.resumeWithException(AsyncException(error)) }
	}