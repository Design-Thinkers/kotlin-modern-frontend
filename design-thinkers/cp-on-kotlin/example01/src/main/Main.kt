import kotlinext.js.invoke
import react.dom.render
import kotlinx.browser.document

fun main() {
	render(documnet.getElementById("root")) {
		messageComponent {
			attrs.message = "Hello World!"
		}
	}
}
