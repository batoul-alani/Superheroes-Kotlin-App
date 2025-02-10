import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.sizeIn
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.superheroes.model.Hero
import com.example.superheroes.model.HeroesRepository

@Composable
fun SuperHeroesList(heroes : List<Hero>, contentPadding: PaddingValues = PaddingValues(0.dp),){
    LazyColumn (modifier = Modifier.padding(all = 16.dp)) {
        itemsIndexed(heroes) { index, hero -> SuperHeroesItem(hero = hero, modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp))
        }
    }
}

@Composable
fun SuperHeroesItem(hero : Hero, modifier: Modifier = Modifier){
    Card(
        elevation = CardDefaults.cardElevation(2.dp),
        modifier = modifier
        ) {
        Row (
            modifier = Modifier
                .fillMaxWidth()
                .padding(all = 16.dp)
                .sizeIn(
                    minHeight = 72.dp
                )
        ){
            Column (modifier = Modifier.weight(1f)){
                Text(text = stringResource(id =  hero.title), style = MaterialTheme.typography.displaySmall)
                Text(text = stringResource(id = hero.description), style = MaterialTheme.typography.bodyLarge)
            }
            Spacer(modifier = Modifier.width(16.dp))
            Image(
                modifier = Modifier
                    .clip(MaterialTheme.shapes.small)
                    .size(width = 72.dp, height = 72.dp),
                painter = painterResource(id = hero.image), contentDescription = null, alignment = Alignment.TopCenter,
                contentScale = ContentScale.FillWidth)
        }
    }
}