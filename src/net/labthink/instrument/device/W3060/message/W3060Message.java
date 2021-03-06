package net.labthink.instrument.device.W3060.message;

import net.labthink.instrument.device.base.message.AbstractPacket;


public class W3060Message extends AbstractPacket implements W3060MessageParams{

    /**
	 * 
	 */
	private static final long serialVersionUID = 2451260715528676406L;

	public W3060Message() {
	reset();
    }

    public W3060Message(byte[] _content) {
	defaultPacket(_content);
    }

    public void reset() {
	defaultPacket(null);
    }

    /**
     * 重置为默认包体内容
     * @param _content 重置时的content内容。如传入null则初始化为new byte[CommonParameters.PACKET_BODY_LEN];
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
