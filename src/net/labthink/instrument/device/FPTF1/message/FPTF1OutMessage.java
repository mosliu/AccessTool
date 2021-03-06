package net.labthink.instrument.device.FPTF1.message;

import net.labthink.instrument.device.base.message.AbstractPacket;

/**
 * FPTF1's 51-PC Message
 *
 * @version        1.0.0.0, Aug 24, 2010
 * @author         Moses
 */
public class FPTF1OutMessage extends AbstractPacket implements
		FPTF1OutMessageParams {


	
    public FPTF1OutMessage(){
    }
	public FPTF1OutMessage(byte[] _content) {
	}

	

	/**
	 * 重置为默认包体内容
	 * 
	 * @param _content
	 *            重置时的content内容。如传入null则初始化为new
	 *            byte[CommonParameters.PACKET_BODY_LEN];
	 */
	protected void defaultPacket(byte[] _content) {
		this.header = PACKET_HEADER;
		this.tail = PACKET_TAIL;
		this.length = PACKET_FULL_LEN;
		if (_content == null) {
			this.content = new byte[PACKET_BODY_LEN];
		} else {
			this.content = _content;
		}
	}

}
