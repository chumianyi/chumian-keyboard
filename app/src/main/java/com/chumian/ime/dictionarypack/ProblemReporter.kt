package com.chumian.ime.dictionarypack

/**
 * A simple interface to report problems.
 */
interface ProblemReporter {
    fun report(e: Exception?)
}