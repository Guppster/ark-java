data class Account(var address: String?,
                   var publicKey: String?,
                   var username: String?,
                   var balance: Long?,
                   var vote: Long?,
                   var votes: List<Long>?)
{
    fun applyTransaction(transaction: Transaction): Boolean
    {
        return true
    }

    fun undoTransaction(transaction: Transaction): Boolean
    {
        return true
    }

    fun verifyTransaction(transaction: Transaction): Verification
    {
        return Verification()
    }
}

