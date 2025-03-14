import { NgModule } from '@angular/core';
import { BrowserModule, provideClientHydration } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { InfoItemComponent } from './info-item/info-item.component';
import { FormsModule } from '@angular/forms';
import { TopicBoxComponent } from './topic-box/topic-box.component';

@NgModule({
  declarations: [
    AppComponent,
    InfoItemComponent,
    TopicBoxComponent //components, directives, and pipes
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule
  ],
  providers: [
    provideClientHydration() //services defined in the app module
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }