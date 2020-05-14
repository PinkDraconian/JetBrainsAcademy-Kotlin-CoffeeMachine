// write the BankAccount class here
data class BankAccount constructor(var deposited: Long, var withdrawn: Long) {
    val balance: Long = deposited - withdrawn
}
