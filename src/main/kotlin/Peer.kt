import groovyx.net.http.AsyncHTTPBuilder

class Peer(peerInfo: String, headers: Triple<String, String, Int>)
{
    private var protocol: String = "http://"
    private var status: String = "NEW"

    private lateinit var http: AsyncHTTPBuilder

    init
    {
        val data = peerInfo.split(':')
        val ip: String = data[0]
        val port: Int = data[1].toInt()

        if (port % 1000 == 443) protocol = "https://"
    }
}
