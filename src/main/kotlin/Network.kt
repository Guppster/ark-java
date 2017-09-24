import java.util.*

data class Network(
        var nethash: String,
        var version: String = "1.0",
        var name: String,
        var broadcastMax: Int = 10,
        var port: Int,
        var prefix: Byte,
        var peerseed: List<String>,
        var peers: MutableList<Peer> = mutableListOf())
{
    val random = Random()

    fun getHeaders(): Triple<String, String, Int>
    {
        return Triple(nethash, version, port)
    }

    fun warmup(): Boolean
    {
        if (peers.isNotEmpty()) return false

        peerseed.forEach { peers.add(Peer(it, this.getHeaders())) }

        return true
    }
}