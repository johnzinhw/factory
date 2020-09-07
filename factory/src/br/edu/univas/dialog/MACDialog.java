package br.edu.univas.dialog;

import br.edu.univas.ex.Button;
import br.edu.univas.ex.Dialog;
import br.edu.univas.ex.MACButton;

public class MACDialog extends Dialog {

	@Override
	public Button createButton() {
		return new MACButton();
	}

}
