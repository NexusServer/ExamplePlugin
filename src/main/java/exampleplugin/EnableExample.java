package exampleplugin;

import cn.nukkit.event.Listener;
import cn.nukkit.plugin.PluginBase;

public class EnableExample extends PluginBase implements Listener {

	@Override
	// 플러그인이 활성화
	public void onEnable() {

		// registerEvents -> 서버에서 일어나는 이벤트를 건네받는 Listener를 등록함
		this.getServer().getPluginManager().registerEvents(this, this);

		// plugin Enable라는 메세지를 콘솔창에 띄움
		this.getLogger().info("plugin Enable!");

	}
}
