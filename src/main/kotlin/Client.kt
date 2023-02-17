import kotlinx.browser.document
import react.create
import react.dom.client.createRoot

fun main() {
    val container = document.createElement("div")
    // document.body is not null (!!), then add container
    document.body!!.appendChild(container)

    val welcome = Welcome.create {
        name = "Conor Villarreal"
    }
    createRoot(container).render(welcome)
}