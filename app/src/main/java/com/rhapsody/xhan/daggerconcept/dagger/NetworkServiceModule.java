package com.rhapsody.xhan.daggerconcept.dagger;

import android.app.Application;
import android.widget.Toast;

import com.rhapsody.xhan.daggerconcept.CachePolicy;
import com.rhapsody.xhan.daggerconcept.NetworkManager;
import com.squareup.okhttp.Cache;
import com.squareup.okhttp.OkHttpClient;

import java.io.File;
import java.io.IOException;

import dagger.Module;
import dagger.Provides;

/**
 * @todo: add class description
 */
@Module (library = true, includes = {CachePolicyModule.class})
@SuppressWarnings("unused")
public class NetworkServiceModule {

	@Provides
	@NotCached
	OkHttpClient provideDefaultHttpClient() {
		System.out.println(">>>>>>>>>>>>>>>>>>Injecting NOT cached client");
		return new OkHttpClient();
	}

	@Provides
	@Cached
	OkHttpClient provideClientWithCache(CachePolicy policy) {
		System.out.println(">>>>>>>>>>>>>>>>>>Injecting cached client");
		System.out.println(">>>>>>>>>>>>>>>>>>Cache policy:" + policy.toString());
		OkHttpClient httpClient = new OkHttpClient();
		return httpClient;
	}
}
