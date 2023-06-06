import react.RBuilder
import react.dom.div
import react.fc

external interface MessageProps : react.RProps {
	var message: String
}

val messageComponent = fc<MessageProps> { props ->
	div {
		+"Message: ${props.message}"
	}
}
