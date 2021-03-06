package net.labthink.instrument.device.${devicename}.message;

import net.labthink.instrument.device.base.message.AbstractPacket;

/**
 * ${devicename}'s 51-PC Message
 *
 * @version        ${version}, ${pp.now?date}
 * @author         ${author?cap_first}
 */
public class ${devicename}OutMessage extends AbstractPacket implements
		${devicename}OutMessageParams {


	
    public ${devicename}OutMessage(){
    }
	public ${devicename}OutMessage(byte[] _content) {
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
